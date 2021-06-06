module Main where

import Text.Printf (printf)

main :: IO ()
main = do
  a <- readLn :: IO Int
  b <- readLn :: IO Int
  printf "SOMA = %d\n" (a + b)
