module Main where

import Data.List
import Text.Printf

selectionTest [a, b, c, d] =
  let t1 = b > c
      t2 = d > a
      t3 = sum [c, d] > sum [a, b]
      t4 = c > 0 && d > 0
      t5 = even a
   in t1 && t2 && t3 && t4 && t5

main :: IO ()
main = do
  x <- getLine
  let numbers = map read (words x) :: [Int]
  if selectionTest numbers
    then putStrLn "Valores aceitos"
    else putStrLn "Valores nao aceitos"
