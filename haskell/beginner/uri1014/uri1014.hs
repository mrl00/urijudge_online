module Main where

import Control.Monad
import Text.Printf

input :: IO [Double]
input = do
   x <- readLn :: IO Double
   y <- readLn :: IO Double
   return [x,y]

consumption :: [Double] -> Double
consumption [x,y] = x / y

main :: IO ()
main = do
   x <- input
   printf "%.3f km/l\n" $ consumption x




   
