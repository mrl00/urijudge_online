module Main where

import Text.Printf

input :: IO [Double]
input = do
   x <- getLine
   return $ map (\x -> read x :: Double) (words x)

main :: IO ()
main = do
   x <- input
   printf "%.0f eh o maior\n" $ maximum x
