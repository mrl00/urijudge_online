module Main where

main :: IO ()
main = do
	contents <- getContents
	putStrLn $ show $ corrida $ (map read (words contents) :: [Int])
	where corrida [a,b] = mod a b
