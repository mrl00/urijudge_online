module Main where

import Text.Printf (printf)

main :: IO ()
main = do
  t <- readLn :: IO Double
  v <- readLn :: IO Double
  printf "%.3f\n" $ (t * v / 12.0)
