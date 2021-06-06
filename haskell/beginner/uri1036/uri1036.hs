module Main where

import Text.Printf (printf)

bhaskara :: [Double] -> String
bhaskara [a, b, c] =
  let delta = b * b - 4.0 * a * c
      t1 = delta < 0.0
      t2 = a == 0.0
      d1 = - b + sqrt delta
      d2 = - b - sqrt delta
   in if t2 || t1
        then printf "Impossivel calcular\n"
        else printf "R1 = %.5f\nR2 = %.5f\n" (d1 / (2.0 * a)) (d2 / (2.0 * a))

main :: IO ()
main = do
  x <- getLine
  let numbers = map read (words x) :: [Double]
  putStr $ bhaskara numbers
