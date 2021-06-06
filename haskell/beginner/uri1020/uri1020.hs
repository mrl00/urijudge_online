module Main where

import Text.Printf (printf)

d2a :: Int -> [Int]
d2a n = [years n, months n, days n]
  where
    years d = div d 365
    months d = div (mod d 365) 30
    days d = mod (mod d 365) 30

main :: IO ()
main = do
  x <- readLn :: IO Int
  let [a, b, c] = d2a x
  printf "%d ano(s)\n%d mes(es)\n%d dia(s)\n" a b c
