module Main where

ap [a,b,c] | a * c > b = "N"
				 	 | otherwise = "S"

main :: IO ()
main = do
	contents <- getContents
	putStrLn $ ap (map read (words contents) :: [Int])

