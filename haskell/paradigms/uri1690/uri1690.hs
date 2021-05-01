module Main where

import Data.List as L
import Data.Set as S

subsets :: [Int] -> [[Int]]
subsets [] = [[]]
subsets (x:xs) = subsets xs ++ L.map (x:) (subsets xs)

f :: Int -> Set [Int] -> Int
f n (Set [])  = succ n
f n (Set (x:xs)) | n == x = f (succ n) (S.fromList xs)
                 | otherwise = n

g _ _ [] = []
g b o (x:xs) | b = o x : g (not b) o xs
					   | otherwise = g (not b) o xs
								
h = f 1 . S.fromList . (L.map sum) . tail . subsets


rInt :: String -> Int
rInt = read

main :: IO ()
main = do
	getContents >>= 
   . map words . lines 
	
