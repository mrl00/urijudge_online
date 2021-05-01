module Main where

main :: IO ()
main = do
	contents <- getContents
	let x = map read (lines contents) :: [Int]
	putStrLn $ show $ length $ filter (\a -> (x !! 0)*a >= 40000000) (drop 2 x)
