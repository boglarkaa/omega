CREATE TABLE book (
  id INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(255) NOT NULL,
  sub_title VARCHAR(255),
  author VARCHAR(255) NOT NULL,
  publishing_house VARCHAR(255),
  cover_image VARCHAR(255),
  rating DOUBLE
);
INSERT INTO internship.book (title,sub_title,author,publishing_house,cover_image,rating) VALUES
	 ('Sample Book','A Great Read','John Doe','ABC Publishing','book_cover.jpg',4.5),
	 ('To Kill a Mockingbird','A Novel','Harper Lee','HarperCollins','to_kill_a_mockingbird.jpg',4.3),
	 ('1984',NULL,'George Orwell','Secker & Warburg','1984.jpg',4.5),
	 ('Pride and Prejudice',NULL,'Jane Austen','T. Egerton','pride_and_prejudice.jpg',4.7),
	 ('The Great Gatsby',NULL,'F. Scott Fitzgerald','Charles Scribner''s Sons','the_great_gatsby.jpg',4.2),
	 ('To the Lighthouse',NULL,'Virginia Woolf','Hogarth Press','to_the_lighthouse.jpg',4.1),
	 ('The Catcher in the Rye',NULL,'J.D. Salinger','Little, Brown and Company','the_catcher_in_the_rye.jpg',4.0),
	 ('Moby-Dick','Or, The Whale','Herman Melville','Harper & Brothers','moby_dick.jpg',4.4),
	 ('The Hobbit',NULL,'J.R.R. Tolkien','George Allen & Unwin','the_hobbit.jpg',4.6),
	 ('Brave New World',NULL,'Aldous Huxley','Chatto & Windus','brave_new_world.jpg',4.3),
	 ('The Lord of the Rings',NULL,'J.R.R. Tolkien','George Allen & Unwin','the_lord_of_the_rings.jpg',4.8);

