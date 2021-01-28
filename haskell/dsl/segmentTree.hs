module Main where

data Tree a = Node (Tree a) (Tree a) 
            | Leaf a 
            deriving(Show)


instance Functor Tree where
   fmap f (Leaf a)   = Leaf (f a)
   fmap f (Node l r) = Node (fmap f l) (fmap f r)


main :: IO ()
main = do
   putStrLn "a"
