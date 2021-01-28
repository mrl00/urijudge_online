module Main where

import Text.Printf
import Data.List
import Data.Maybe
import Data.Foldable

rails :: Eq a => [a] -> [a] -> [a] -> String
rails [] [] [] = "Yes"
rails [] (b:bs) (c:cs)
   | b == c    = rails [] (bs) (cs)
   | otherwise = "No"
rails (a:as) [] (c:cs)
   | a == c    = rails (as) [] (cs)
   | otherwise = rails (as) [a] (c:cs)
rails before@(a:as) station@(b:bs) after@(c:cs)
   | a == c    = rails (as) station (cs)
   | b == c    = rails before (bs) (cs)
   | otherwise = rails (as) (a:station) after 

inputs :: Int -> IO ()
inputs n = do
   x <- getLine
   let numbers = map read (words x) :: [Int]
   checkInput numbers
   where checkInput xs  | xs == [0] = putStrLn ""
                        | otherwise = do
                              putStrLn $ rails [1..n] [] xs
                              inputs n

main :: IO ()
main = do
   n <- readLn :: IO Int
   checkInput n
   where checkInput x | x == 0 = putStr ""
                      | otherwise = do
                           inputs x
                           main
