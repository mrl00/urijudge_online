module Main where

pas_tri 0 = 0
pas_tri n = (2^(n-1)) + pas_tri (n - 1)

main :: IO ()
main = do
	contents <- getContents
	let x = map read (tail $ lines contents) :: [Int]	
	mapM_ putStrLn $ map (show . pas_tri) x
