module Main where

pasTri :: (Num p, Integral t) => t -> p
pasTri 0 = 0
pasTri n = (2 ^ (n -1)) + pasTri (n - 1)

main :: IO ()
main = do
  getContents >>= mapM_ (print . pasTri . read) . tail . lines