module Main where

main :: IO ()
main = do
	contents <- getContents
	mapM_ putStrLn $ take ((length $ lines contents) - 1) $ repeat "gzuz"
