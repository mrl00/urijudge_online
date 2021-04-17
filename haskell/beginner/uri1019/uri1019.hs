module Main where

import Control.Monad
import Text.Printf


int2time :: Int -> [Int]
int2time n = [div n 3600, mod (div n 60) 60, mod n 60]

main :: IO ()
main = do
   x <- readLn :: IO Int
   let [a,b,c] = int2time x
   printf "%d:%d:%d\n" a b c
