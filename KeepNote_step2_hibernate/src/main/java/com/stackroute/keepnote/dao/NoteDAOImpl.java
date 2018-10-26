package com.stackroute.keepnote.dao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.stackroute.keepnote.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

/*
 * This class is implementing the NoteDAO interface. This class has to be annotated with @Repository
 * annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, thus 
 * 				 clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database 
 * 					transaction. The database transaction happens inside the scope of a persistence 
 * 					context.  
 * */

@Repository("NoteDAO")
@Transactional
public class NoteDAOImpl implements NoteDAO {

	/*
	 * Autowiring should be implemented for the SessionFactory.
	 */



	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	public NoteDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * Save the note in the database(note) table.
	 */

	public boolean saveNote(Note note) {
		session =sessionFactory.getCurrentSession();
		System.out.println(note.toString());
		session.persist(note);
		return true;

	}

	/*
	 * Remove the note from the database(note) table.
	 */

	public boolean deleteNote(int noteId) {
		System.out.println(getNoteById(noteId).toString());
			session=sessionFactory.getCurrentSession();
			session.delete(getNoteById(noteId));
			return true;


	}

	/*
	 * retrieve all existing notes sorted by created Date in descending
	 * order(showing latest note first)
	 */

	public List<Note> getAllNotes() {
		session =sessionFactory.getCurrentSession();
		CriteriaQuery<Note> criteriaQuery = session.getCriteriaBuilder().createQuery(Note.class);
		criteriaQuery.from(Note.class);
		List<Note> list = session.createQuery(criteriaQuery).getResultList();
		//Criteria criteria=session.createCriteria(Note.class);
		System.out.println("list ofdd "+list);
		return list;

	}

	/*
	 * retrieve specific note from the database(note) table
	 */
	public Note getNoteById(int noteId) {

		return sessionFactory.getCurrentSession().get(Note.class,noteId);

	}

	/* Update existing note */

	public boolean UpdateNote(Note note) {
		System.out.println(note.toString());
		Note note1=getNoteById(note.getNoteId());
		if(note1!=null){
			note1.setNoteTitle(note.getNoteTitle());
			note1.setNoteContent(note.getNoteContent());
			note1.setNoteStatus(note.getNoteStatus());
			return true;
		}
		return false;
	}

}
