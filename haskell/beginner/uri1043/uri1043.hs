module Main where

import Text.Printf (printf)

--(b - c) < a && a < (b + c) && (a - c) < b && b < (a + c) && (a - b) < c && c < (a + b)

isValidTri :: [Double] -> Bool
isValidTri [a, b, c] = (b - c) < a && a < (b + c) && (a - c) < b && b < (a + c) && (a - b) < c && c < (a + b)

main :: IO ()
main = do
  input <- getLine
  let x = map read (words input) :: [Double]
  if isValidTri x
    then printf "Perimetro = %.1f\n" (perimetro x)
    else printf "Area = %.1f\n" (area x)
  where
    perimetro [a, b, c] = a + b + c
    area [a, b, c] = ((a + b) * c) / 2.0
