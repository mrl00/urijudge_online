module Main where

import Data.List (groupBy)

main :: IO ()
main = do
	contents <- getContents
	--putStrLn contents
	putStrLn $ show $ length $ groupBy (==) $ (tail (map read (lines contents) :: [Int])) 
