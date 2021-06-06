module Main where

import Data.List (sort)

main :: IO ()
main = do
  input <- getLine
  let x = map read (words input) :: [Int]
  putStr . unlines $ map show $ sort x
  putStrLn ""
  putStr . unlines $ map show x
