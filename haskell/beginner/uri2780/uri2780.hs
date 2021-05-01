module Main where

br [n] | n <= 800 = 1
			 | n > 800 && n <= 1400 = 2
		   | otherwise = 3

main :: IO ()
main = do
	x <- readLn :: IO Int
	putStrLn $ show $ br [x]
