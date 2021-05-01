module Main where

lc [l,c] | l > c = c
			 	 | otherwise = 0

main :: IO ()
main = do
	contents <- getContents
	putStrLn $ show $ sum $ map lc $ map (map read) $ map words (tail $ lines contents)
