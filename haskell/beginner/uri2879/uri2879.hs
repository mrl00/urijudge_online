module Main where

main :: IO ()
main = do
	contents <- getContents
	let x = map read (tail $ lines contents) :: [Int]
	putStrLn $ show $ length $ filter (/= 1) x
