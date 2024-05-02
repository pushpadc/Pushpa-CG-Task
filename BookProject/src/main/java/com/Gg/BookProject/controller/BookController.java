@RestController

@AllArgsConstructor

@RequestMapping("apt/books")
public class Book Controller (
	
	@Autowired
	private BookService bookService;
	
	@PostMapping
	public ResponseEntity Book> createbook(@RequestBody look book) (
	Book savedlook bookService.createBook(book);
	return new Response Entity (savedBook, HttpStatus.CREATED);
	
	}
	
	GetMapping{"{id}"}
	
	public Response Entity<Book> getBookById(@PathVartable("id") Long nookid) {
	 Book book bookService.getBookllyId(bookId);
	return new Response Entity(book, HttpStatus.OK);
	
	@GetMapping

	public ResponseEntity List<Book>>>getAllBooks(){
	LIST<Book bookList = bookService.getALiBooks();
	return new Response Entity(booklist, HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	
	public Response Entity <Book> updatebook(@PathVariable("id") Long bookId, @RequestBody Book
	bonk) {
	book.setId(nookid);
	Book updatedBook bookService.updatellook(book);
	return new ResponseEntity(updatedBook, HrtsStatus.OK);
	
	DeleteMapping("{id}")
	public  ResponseEntity<String> deleteBook(@PathVariable("id") Long bookId) (
	bookservice.deletebook(bookid);
	return new ResponseEntity("Book was deleted successfully", HttpStatus.OK);
	}
	
	

}
