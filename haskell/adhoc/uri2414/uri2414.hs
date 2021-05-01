module Main where

main :: IO ()
main = do
	contents <- getContents
	putStrLn $ show $ maximum $ (map read (words contents) :: [Int])
