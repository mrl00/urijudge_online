module Main where

xor a b = a /= b

plug [_, []] = []
plug [[], _] = []
plug [(a:as), (x:xs)] = xor a x : plug [as, xs]

output False = "N"
output True = "Y"

main :: IO ()
main = do
	contents <- getContents
	putStrLn . output . and . plug $ map words (lines contents)

	
