module Main where

data Team = Team 	{victory :: Int, draw :: Int, balance :: Int} deriving (Show)

instance Eq Team where
	(Team a b c) == (Team x y z) = (a*3 + b) == (x*3 + y) && c == z
	m@(Team a b c) /= n@(Team x y z) = not (m == n)

instance Ord Team where
	m@(Team a b c) > n@(Team x y z) = total m > total n || total m == total n && c > z
	m@(Team a b c) < n@(Team x y z) = n > m

total :: Team -> Int
total (Team a b c) = a * 3 + b

initTeam :: [Int] -> Team
initTeam [a,b,c] = Team a b c

compareTeams :: Team -> Team -> [Char]
compareTeams t1 t2 | t1 > t2 = "C"
									 | t1 < t2 = "F"
									 | otherwise = "="

main :: IO ()
main = do
	contents <- getContents
	let x = map read (words contents)	:: [Int]
	let [t1, t2] = [initTeam $ take 3 x, initTeam $ drop 3 x]
	putStrLn $ compareTeams t1 t2
	
	
