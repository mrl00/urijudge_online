module Collatz (collatzConj) where

collatzConj :: Int -> Int
collatzConj x
  | x > 1 && even x = div x 2
  | x > 1 && odd x = 3 * x + 1
  | otherwise = 1