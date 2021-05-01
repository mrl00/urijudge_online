module Main where

fliper 0 _ = "C"
fliper 1 0 = "B"
fliper 1 1 = "A"
fliper p r | p /= 1 = fliper 1 r
					 | r /= 0 = fliper p 1

main :: IO ()
main = do
	contents <- getContents
	let [p, r] = map read (words contents) :: [Int]
	putStrLn $ fliper p r	
