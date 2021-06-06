module Main where

xor :: Bool -> Bool -> Bool
xor a b = a /= b

xadrez [a, b]
  | not $ xor (even a) (even b) = 1
  | otherwise = 0

main :: IO ()
main = do
  contents <- getContents
  print (xadrez (map read (lines contents) :: [Int]))
