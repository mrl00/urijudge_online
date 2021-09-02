module Main where

gangorra x y
  | x > y = -1
  | x < y = 1
  | otherwise = 0

main :: IO ()
main = do
  contents <- getContents
  let [a, b, c, d] = map read (words contents) :: [Int]
  print (gangorra (a * b) (c * d))
