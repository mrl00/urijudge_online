module Main where

import Data.List (elemIndex)
import Data.Maybe (fromJust)

main :: IO ()
main = do
  contents <- getContents
  print $ (1 +) $ fromJust $ elemIndex 1 (map read (words contents) :: [Int])
