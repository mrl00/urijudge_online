module Main where

import Text.Printf (printf)

main :: IO ()
main = do
  x <- readLn :: IO Int
  printf "%d minutos\n" (x * 2)
