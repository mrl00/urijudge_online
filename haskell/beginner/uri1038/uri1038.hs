module Main where

import Text.Printf (PrintfType, printf)

total :: PrintfType a => [Int] -> a
total [c, q] =
  let t = [4.0, 4.5, 5.0, 2.0, 1.5] :: [Double]
      v = (t !! (c -1)) * fromIntegral q
   in printf "Total: R$ %.2f" v

main :: IO ()
main = do
  x <- getLine
  let n = map read (words x) :: [Int]
  putStrLn $ total n
