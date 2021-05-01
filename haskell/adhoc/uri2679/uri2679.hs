module Main where

max_next_even n | odd n = n + 1
								| otherwise = n + 2

main :: IO ()
main = do
	x <- readLn :: IO Int
	putStrLn $ show $ max_next_even x
	
