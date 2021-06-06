module Main where

import Text.Printf (printf)

main :: IO ()
main = do
  a <- getLine
  b <- readLn :: IO Double
  c <- readLn :: IO Double
  printf "TOTAL = R$ %.2f\n" (b + 0.15 * c)
