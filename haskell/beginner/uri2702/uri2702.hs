module Main where

main :: IO ()
main = do
  i1 <- getLine
  i2 <- getLine
  let a = map read (words i1) :: [Int]
  let x = map read (words i2) :: [Int]
  print $ sum $ filter (>= 0) $ zipWith (-) x a
