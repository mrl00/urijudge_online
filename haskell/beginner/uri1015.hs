module Main where

import Control.Monad
import System.IO
import Text.Printf

toDouble :: String -> Double
toDouble x = (read x :: Double)

input :: IO [[Double]]
input = do
    inputArray <- replicateM 2 getLine
    let inputDouble = [map toDouble d | d <- map words inputArray]
    return inputDouble

distance :: [[Double]] -> Double
distance [[x1,y1], [x2,y2]] = sqrt $ diffsqr x1 x2 + diffsqr y1 y2 
    where diffsqr a b = (a - b)^2


main :: IO ()
main = do
    points <- input
    printf "%.4f\n" $ distance points
    