module Main where

take2 :: [a] -> [[a]]
take2 [] = []
take2 all = take 2 all : take2 (drop 2 all)

ness [a,b] =(ops a) * (ops b)
	where ops x = ceiling $ (x - 2) / 3.0

main :: IO ()
main = do
	contents<-getContents
	mapM_ (putStrLn . show) $ map ness $ ((map (map read) $ map words (tail $ lines contents)) :: [[Double]])
