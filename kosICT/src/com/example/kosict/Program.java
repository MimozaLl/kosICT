package com.example.kosict;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Program extends Activity {
	final int ITEM_1 = 1, ITEM_2 = 2, ITEM_3 = 3, ITEM_4 = 4, ITEM_5 = 5,
			ITEM_6 = 6, ITEM_8 = 8, ITEM_9 = 9, ITEM_10 = 10, ITEM_11 = 11,
			ITEM_12 = 12, ITEM_13 = 13, ITEM_14 = 14, ITEM_15 = 15,
			ITEM_16 = 16, ITEM_17 = 17, ITEM_18 = 18;
	private ArrayList<Day> Digital = new ArrayList<Day>();
	private ArrayList<Day> Mobile = new ArrayList<Day>();
	private ArrayList<Day> Outsourcing = new ArrayList<Day>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day);

		TextView tv = (TextView) findViewById(R.id.tvTitleListView);
		tv.setText("Agenda");

		populateDays();
		populateListView();
		registerClickCallback();

	}

	private void populateDays() {

		Digital.add(new Day("Registration & coffee", "08:30", "", "", "",
				"Main Hall"));
		Digital.add(new Day("Opening of the Conference", "09:00", "", "", "",
				"Main Auditorium"));

		Digital.add(new Day("Digital Transformation", "09:30", "",
				"Alexander Ammer", new String(
						getString(R.string.AlexanderAmmer)), "Main Auditorium"));
		Digital.add(new Day("Digital Transformation", "09:55", "",
				"Jimmy Leach", new String(getString(R.string.JimmyLeach)),
				"Main Auditorium"));
		Digital.add(new Day("Digital Transformation", "10:20", "",
				"Anders Indset", new String(getString(R.string.AndersIndset)),
				"Main Auditorium"));
		Digital.add(new Day("Digital Transformation", "10:40", "",
				"Georgy Bouchkov", new String(getString(R.string.Gold)),
				"Main Auditorium"));
		Digital.add(new Day("Digital Transformation", "11:00", "", "Sumup", "",
				"Main Auditorium"));
		Digital.add(new Day("Coffee break", "11:15", "", "", "", "Main Hall"));

		Outsourcing.add(new Day("Future of Outsourcing/Nearshoring", "11:30",
				"", "Bernhard Janischowsky", new String(
						getString(R.string.BernhardJanischowsky)),
				"Main Auditorium"));
		Outsourcing.add(new Day("Future of Outsourcing/Nearshoring", "11:55",
				"", "Uranik Begu", new String(getString(R.string.UranikBegu)),
				"Main Auditorium"));
		Outsourcing.add(new Day("Future of Outsourcing/Nearshoring", "12:20",
				"", "Case studies", "", "Main Auditorium"));
		Outsourcing.add(new Day("Future of Outsourcing/Nearshoring", "12:45",
				"", "SUMUP", "", "Main Auditorium"));
		Outsourcing.add(new Day("Networking Lunch", "13:10", "", "", "",
				"Main Auditorium"));
		Mobile.add(new Day("Mobile Solutions", "14:20", "",
				"Arild Bjørn-Larsen", new String(
						getString(R.string.ArildLarsen)), "Main Auditorium"));
		Mobile.add(new Day("Mobile Solutions", "14:45", "", "Karl-J. Wack",
				new String(getString(R.string.KarlWack)), "Main Auditorium"));
		Mobile.add(new Day("Mobile Solutions", "15:10", "", "Case studies", "",
				"Main Auditorium"));
		Mobile.add(new Day("Mobile Solutions", "15:35", "", "SUMUP", "",
				"Main Auditorium"));
		Mobile.add(new Day("Closing", "16:00", "", "", "", "Main Auditorium"));

	}

	private void populateListView() {
		ArrayAdapter<Day> adapter = new MyListAdapter();
		ListView digitalTransform = (ListView) findViewById(R.id.DigitalTransform);
		digitalTransform.setAdapter(adapter);

		ListView outsourcingFuture = (ListView) findViewById(R.id.OutsourcingFuture);
		outsourcingFuture.setAdapter(adapter);

		ListView mobileSolutions = (ListView) findViewById(R.id.MobileSolutions);
		mobileSolutions.setAdapter(adapter);
	}

	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.DigitalTransform);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
				showDialog(position);
				/*
				 * String message = "You clicked position " + position+
				 * "  The Time for this is " +
				 * clickedDay.getTimeStart()+" - "+clickedDay.getTimeEnd()
				 * +". The topic is "+clickedDay.getTitlef();
				 * 
				 * Toast.makeText(Saturday.this, message,
				 * Toast.LENGTH_LONG).show();
				 */
			}

		});
	}

	private Dialog createListItemDialog(Day clickedDay) {
		final AlertDialog.Builder builder = new AlertDialog.Builder(this);

		final View view = getLayoutInflater().inflate(R.layout.list_view_item,
				null, false);// inflates the dev_about layout

		final TextView tvDescription = (TextView) view
				.findViewById(R.id.Text_ViewItem_Description);
		tvDescription.setText(clickedDay.getDescription());

		final TextView tvSpeaker = (TextView) view
				.findViewById(R.id.Text_ViewItem_Speaker);
		tvSpeaker.setText(clickedDay.getSpeaker());

		final TextView tvRoom = (TextView) view
				.findViewById(R.id.Text_ViewItem_Room);
		tvRoom.setText(clickedDay.getRoom());

		builder.setTitle(clickedDay.getTitlef()); // sets title to AlertDialog*/
		// builder.setIcon(R.drawable.action_a); // sets the icon to Alert
		// Dialog
		builder.setView(view); // // sets the view for builder
		builder.setPositiveButton(getString(android.R.string.ok), null); // the
																			// possitive
																			// button
																			// strings
																			// is
																			// ok
		builder.setCancelable(true); // the dialog is cancelable after clicked
										// ok
		// builder.setMessage(clickedDay.getDescription());
		return builder.create(); // creates the dialog
	}

	private class MyListAdapter extends ArrayAdapter<Day> {
		public MyListAdapter() {
			super(Program.this, R.layout.listitem);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.listitem,
						parent, false);
			}

			// Find the Day to work with
			Day currentDay = Digital.get(position);

			// StartTime:
			TextView startTime = (TextView) itemView
					.findViewById(R.id.t_v_startTime);
			startTime.setText(currentDay.getTimeStart());

			// Title:
			TextView title = (TextView) itemView.findViewById(R.id.t_v_title);
			title.setText(currentDay.getTitlef());

			// Speaker:
			TextView speaker = (TextView) itemView
					.findViewById(R.id.t_v_speaker);
			speaker.setText(currentDay.getSpeaker());

			return itemView;
		}
	}

	public boolean onCreateOptionsMenu(Menu menu) // for the Menu
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected Dialog onCreateDialog(int id) // creates a new dialog
	{
		switch (id) // switches threw the id of items
		{

		case ITEM_1:
			return createListItemDialog(Digital.get(id));
			
		case ITEM_2:
			return createListItemDialog(Digital.get(id)); 
			
		case ITEM_3:
			return createListItemDialog(Digital.get(id)); 
			
		case ITEM_4:
			return createListItemDialog(Digital.get(id));

		case ITEM_5:
			return createListItemDialog(Digital.get(id));

		case ITEM_6:
			return createListItemDialog(Digital.get(id));

		case ITEM_8:
			return createListItemDialog(Digital.get(id));

		case ITEM_9:
			return createListItemDialog(Digital.get(id));
			
		case ITEM_10:
			return createListItemDialog(Outsourcing.get(id));
			
		case ITEM_11:
			return createListItemDialog(Outsourcing.get(id));
			
		case ITEM_12:
			return createListItemDialog(Outsourcing.get(id));
			
		case ITEM_13:
			return createListItemDialog(Outsourcing.get(id));
			
		case ITEM_14:
			return createListItemDialog(Mobile.get(id));
			
		case ITEM_15:
			return createListItemDialog(Mobile.get(id));
			
		case ITEM_16:
			return createListItemDialog(Mobile.get(id));
			
		case ITEM_17:
			return createListItemDialog(Mobile.get(id));
			
		case ITEM_18:
			return createListItemDialog(Mobile.get(id));
			
		default:
			return null;
		}

	}

}
