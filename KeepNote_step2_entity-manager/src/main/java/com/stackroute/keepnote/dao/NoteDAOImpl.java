package com.stackroute.keepnote.dao;

import java.util.List;
import com.stackroute.keepnote.model.Note;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;;

/*
 * This class is implementing the NoteDAO interface. This class has to be annotated with @Repository
 * annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, thus
 * 				 clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database
 * 					transaction. The database transaction happens inside the scope of a persistence
 * 					context.
 * */
@Repository
@Transactional
public class NoteDAOImpl implements NoteDAO {

	private static final String PERSISTENCE_UNIT_NAME = "Note";
	Note note;
	@PersistenceContext
	private EntityManager em ;/*
	 * Autowiring should be implemented for the SessionFactory.
	 */
	/*
	 * Save the note in the database(note) table.
	 */
	@Transactional
	public boolean saveNote(Note note) {
		em.persist(note);
		em.close();
		return true;
	}

	/*
	 * Remove the note from the database(note) table.
	 */
	@Transactional
	public boolean deleteNote(int noteId) {
		note = em.find(Note.class,noteId);
		if(note !=null) {
			em.remove(note);
			em.close();
			return true;
		}
		else {
			return false;
		}
	}

	/*
	 * retrieve all existing notes sorted by created Date in descending
	 * order(showing latest note first)
	 */
	@Transactional(readOnly = true)
	public List<Note> getAllNotes() {
		List result = em.createQuery("FROM Note note ORDER BY note.createdAt DESC").getResultList();
        em.close();
		return result;
	}

	/*
	 * retrieve specific note from the database(note) table
	 */
	@Transactional(readOnly = true)
	public Note getNoteById(int noteId) {
		Note note = em.find(Note.class,noteId);
        em.close();
		return note;


	}

	/* Update existing note */
	@Transactional
	public boolean UpdateNote(Note note) {
		note = em.find(Note.class,note.getNoteId());
		if(note==null) {
			return false;
		}
		else {
			/*
			sessionFactory.getCurrentSession().clear();
			sessionFactory.getCurrentSession().update(note);
			sessionFactory.getCurrentSession().flush();
			*/
			em.merge(note);
			em.close();
			return true;

		}


	}

}