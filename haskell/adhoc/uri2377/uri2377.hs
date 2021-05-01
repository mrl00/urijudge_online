module Main where

toll [[l,d],[k,p]] = p * (div l d) + k * l

main :: IO ()
main = do
	contents <- getContents
	print $  toll ((map (map read) $ map words (lines contents))::[[Int]])
