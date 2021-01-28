module Main where

import Text.Printf
import Data.List
import Data.Maybe

bt [] = 0
bt all@(a:as) = length $ filter (==True) $ zipWith (==) (sort all) $ reverse all


main :: IO ()
main = do
   n <- readLn :: IO Int
   ans n
   where 
      ans 0 = putStr ""
      ans k = do
         m <- readLn :: IO Int
         i <- getLine
         let x = map read (words i) :: [Int]
         print $ bt x
         ans (k - 1)
