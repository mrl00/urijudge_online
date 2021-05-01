module Main where

import Data.List (sort)

main :: IO ()
main = do
	contents <- getContents
	let a = map read (words $ head $ lines contents) :: [Int]
	let b = sort $ tail $ lines contents
	putStrLn $ (b !!) $ (+(-1)) $ a !! 1
	
