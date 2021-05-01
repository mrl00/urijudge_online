module Main where

main :: IO ()
main = do
	contents <- getContents
	print $ nota $ ((map read (lines contents)) :: [Int])
	where nota [a,b] = 2*b - a
