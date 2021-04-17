module Main where

import Control.Monad
import Text.Printf

input :: IO [[Int]]
input = do
   n <- readLn :: IO Int
   i <- replicateM n getLine
   return $ map (\x -> map read x :: [Int]) (map words i)


oddSum :: [Int] -> Int
oddSum [x,y] = sum [k| k <- [x..(x + 2*y - 1)], odd k]

showResult (x:xs) = printf "%d\n" x

main :: IO () 
main = do
   x <- input
   mapM_ print (map oddSum x)
