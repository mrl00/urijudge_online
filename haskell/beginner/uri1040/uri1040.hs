module Main where

import Data.List
import Text.Printf

avg3 :: [Double] -> [Double] -> Double
avg3 v@(a : as) w@(b : bs) = sum (zipWith (*) v w) / sum w

scoreStatus :: Double -> String
scoreStatus n
  | n >= 7.0 = "Aluno aprovado.\n"
  | n < 5.0 = "Aluno reprovado.\n"
  | otherwise = "Aluno em exame.\n"

inExam :: Double -> IO ()
inExam m = do
  input <- getLine
  let x = read input :: Double
  let y = (x + m) / 2.0
  printf "Nota do exame: %.1f\n%sMedia final: %.1f\n" x (inExSS y) y
  where
    inExSS k
      | k >= 5.0 = scoreStatus 7.0
      | otherwise = scoreStatus 0.0

studentStatus :: Double -> IO ()
studentStatus m
  | m >= 7.0 = printf (fmt ++ scoreStatus m) m
  | m < 5.0 = printf (fmt ++ scoreStatus m) m
  | otherwise = do
    printf (fmt ++ scoreStatus m) m
    inExam m
  where
    fmt = "Media: %.1f\n"

main :: IO ()
main = do
  x <- getLine
  let m = avg3 (map read (words x) :: [Double]) [2.0, 3.0, 4.0, 1.0]
  studentStatus m
