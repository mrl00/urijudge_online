module Main where

data Mail = Mail Int Int deriving (Show, Eq, Ord)

fixMail :: Mail -> Mail
fixMail m@(Mail a b) | a > b = Mail b a
										 | otherwise = m

take2Mails :: [Int] -> (Mail, Mail)
take2Mails [a,b,c,d] = (fixMail $ Mail a b, fixMail $ Mail c d)

result :: (Mail, Mail) -> [Char]
result (Mail a b, Mail c d) | a < c && b < d = "S"
														| otherwise  = "N"

main :: IO ()
main = do
	contents <- getContents
	mapM_ putStrLn $ map (result . take2Mails) $ ((map (map read) (map words (tail $ lines contents))) :: [[Int]])
