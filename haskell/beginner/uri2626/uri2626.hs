module Main where

ppt :: String -> String -> Int
ppt "pedra" "tesoura" = 1 
ppt "tesoura" "pedra" = 1
ppt "tesoura" "papel" = 2
ppt "papel" "tesoura" = 2
ppt "pedra" "papel"   = 3
ppt "papel" "pedra"   = 3
ppt a b | a == b = 0
        | otherwise = ppt a b

game :: [String] -> Int
game [a,b,c]   | a /= b && b /= c  = 0
               | a == b && b == c  = 0
               | otherwise         = f a b c
               where 
                  f x y z | x == y    = ppt x z
                          | otherwise = ppt x y

main :: IO ()
main = do
   contents <- getContents
   map game $ map words $ map lines contents

   
                         
                            
