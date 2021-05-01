module Main where

valid :: Ord a => [[a]] -> Bool
valid [[a], [b,c], [d,e]] = between b c && between d e
	where between z x = a >= z && a <= x

ispossible :: Bool -> [Char]
ispossible a | a = "possivel"
						 | otherwise = "impossivel"

main :: IO ()
main = do
	contents <- getContents
	putStrLn $ (ispossible . valid) ((map (map read) (map words (lines contents))) :: [[Int]])

