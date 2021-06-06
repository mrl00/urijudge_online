module Main where

import Text.Printf

input :: IO [Double]
input = do
  map (\x -> read x :: Double) . words <$> getLine

main :: IO ()
main = do
  x <- input
  printf "%.0f eh o maior\n" $ maximum x
