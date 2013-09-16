package com.example.kosict;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class Sponsor extends Activity
{
	private final int UPDATE = 500;
	private final int  DIALOG_ABOUT = 0; // used for the item menu which is selected
	ImageView ipkoFoundation;
	ImageView ick;
	ImageView ipak;
	ImageView digjitale;
	ImageView cacttus;
	ImageView spark;
	ImageView cisco;
	ImageView crimson;
	ImageView telegrafi;
	ImageView emerald;
	ImageView universum;
	ImageView ipko;
	ImageView kosovaLive;
	ImageView entermedia;
	ImageView frakton;
	ImageView graphics;
	ImageView vm3;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sponsor);
		
		//set the views for ImageViews in the layout
		ipkoFoundation = (ImageView) findViewById(R.id.imageViewIpkoFoundation);
		ick = (ImageView) findViewById(R.id.imageViewICK);
		ipak = (ImageView) findViewById(R.id.imageViewIPAK);
		digjitale = (ImageView) findViewById(R.id.imageViewDigjitale);
		cacttus = (ImageView) findViewById(R.id.imageViewCacttus);
		
		spark = (ImageView) findViewById(R.id.ImageViewSPARK);
		cisco = (ImageView) findViewById(R.id.imageViewCisco);
		crimson = (ImageView) findViewById(R.id.imageViewCrimson);
		telegrafi = (ImageView) findViewById(R.id.imageViewTelegrafi);
		emerald = (ImageView) findViewById(R.id.imageViewEmerald);
		universum = (ImageView) findViewById(R.id.imageViewUniversum);
		ipko = (ImageView) findViewById(R.id.imageViewIpko);
		kosovaLive = (ImageView) findViewById(R.id.imageViewKosovaLive);
		entermedia = (ImageView) findViewById(R.id.imageViewEntermedia);
		frakton = (ImageView) findViewById(R.id.imageViewFrakton);
		graphics = (ImageView) findViewById(R.id.imageViewGraphics);
		vm3 = (ImageView) findViewById(R.id.imageViewVM3);



		
		//set the OnClickListeners to open the web pages of the ImageViews when clicked (the sponsors LOGO web pages)
		cisco.setOnClickListener(ListenerCisco);
		spark.setOnClickListener(ListenerSpark);
		crimson.setOnClickListener(ListenerCrimson);
		cacttus.setOnClickListener(ListenerCacttus);
		emerald.setOnClickListener(ListenerEmerald);
		universum.setOnClickListener(ListenerUniversum);
		ipko.setOnClickListener(ListenerIpko);
		kosovaLive.setOnClickListener(ListenerKosovaLive);
		telegrafi.setOnClickListener(ListenerTelegrafi);
		entermedia.setOnClickListener(ListenerEntermedia);
		ipkoFoundation.setOnClickListener(ListenerIpkoF);
		ick.setOnClickListener(ListenerIck);
		ipak.setOnClickListener(ListenerIPAK);
		digjitale.setOnClickListener(ListenerDigjitale);
		frakton.setOnClickListener(ListenerFrakton);
		graphics.setOnClickListener(ListenerGraphics);
		vm3.setOnClickListener(ListenerVM3);


	}
	
	public OnClickListener ListenerIPAK = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.invest-ks.org/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	public OnClickListener ListenerSpark = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.spark-online.org/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	public OnClickListener ListenerCisco = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.cisco.com/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	public OnClickListener ListenerCrimson = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.crimsoncapital.org/home.asp"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	public OnClickListener ListenerTelegrafi = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.telegrafi.com/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	public OnClickListener ListenerEmerald = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.emeraldhotel.info/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	public OnClickListener ListenerUniversum = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.universum-ks.org/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	public OnClickListener ListenerIpko = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.ipko.com/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	public OnClickListener ListenerKosovaLive = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.kosovalive360.com/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	
	public OnClickListener ListenerCacttus = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.cacttus.com/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	public OnClickListener ListenerIpkoF = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://ipkofoundation.org/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	   
	   public OnClickListener ListenerIck = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.ickosovo.com/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	   public OnClickListener ListenerEntermedia = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.entermedia.tv/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	   public OnClickListener ListenerDigjitale = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://digjitale.com/"));                      
	    	  startActivity(webIntent);
	      }
	   };
	
	public OnClickListener ListenerFrakton = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.frakton.com/"));                      
	    	  startActivity(webIntent);
	      }
	      
	      
	   };
	   
	   public OnClickListener ListenerGraphics = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.projectgraphics.eu/"));                      
	    	  startActivity(webIntent);
	      }
	      
	      
	   };
	   
	   public OnClickListener ListenerVM3 = new OnClickListener() 
	   {
	      @Override
	      public void onClick(View v) 
	      {
	    	  Intent webIntent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.projectgraphics.eu/"));                      
	    	  startActivity(webIntent);
	      }
	      
	      
	   };
	   
	  
	   public boolean onCreateOptionsMenu(Menu menu) // for the Menu 
		{
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
		
		
		   
		   /*public boolean onOptionsItemSelected(MenuItem item)
		   {
			    switch (item.getItemId()) // switches the item that is selected
			    {
			    case R.id.itemRefresh:
		    		boolean network = isNetworkAvailable();
		    		if(network == true)
		    		{
		    			showDialog(UPDATE);
		    		}
		    		else
		    			Toast.makeText(Sponsor.this, "No Internet connection!", Toast.LENGTH_LONG).show();
		    		return true;
	        	
			    	case R.id.itemWebsite: // case for Web Icon is selected
			    		startActivity(new Intent(Intent.ACTION_VIEW,  Uri.parse("http://sfk.flossk.org/"))); // start Web App with the URL 
			    		return true;
			    	
			    	case R.id.itemDevelopers: // case for Developers selected
			    		showDialog( DIALOG_ABOUT); // calls method showDialog that opens a dialog for the info xml file
			    		return true;
			    }
			    return false; // if not found return false
			}*/
	   
		   
		   @Override
		   protected Dialog onCreateDialog(int id) // creates a new dialog
		   {
				switch (id) // switches threw the id of items 
				{
					case UPDATE: // the about id case
						return createUpdateDialog(); // calls method createAboutDialog() to create the About Dialog
					case DIALOG_ABOUT: // the about id case
						return createAboutDialog(); // calls method createAboutDialog() to create the About Dialog
					default:
						return null;
				}
				
		   }
		   
		   private Dialog createAboutDialog() 
		   {
				final AlertDialog.Builder builder = new AlertDialog.Builder(this); 
				final View view = getLayoutInflater().inflate(R.layout.dev_about, null, false);// inflates the dev_about layout
				builder.setTitle(getString(R.string.app_name)); // sets title to AlertDialog
				builder.setIcon(R.drawable.action_a); // sets the icon to Alert Dialog
				builder.setView(view); //// sets the view for builder
				builder.setPositiveButton(getString(android.R.string.ok), null); // the possitive button strings is ok
				builder.setCancelable(true); // the dialog is cancelable after clicked ok
				return builder.create(); // creates the dialog
			}
		   
		  /* public final void facebook() 
		   {
		        final String urlFb = "facebook://"+"softwarefreedomkosova";
		        Intent intent = new Intent(Intent.ACTION_VIEW);
		        intent.setData(Uri.parse(urlFb));

		        // If Facebook application is installed, use that else launch a browser
		        final PackageManager packageManager = getPackageManager();
		        List<ResolveInfo> list =  packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
		        
		        if (list.size() == 0) 
		        {
		            final String urlBrowser = "https://www.facebook.com/"+"softwarefreedomkosova";
		            intent.setData(Uri.parse(urlBrowser));
		        }

		        startActivity(intent);
		    }*/
	   
		   
		   private boolean isNetworkAvailable() {
			    ConnectivityManager connectivityManager 
			          = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
			    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
			    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
			}
			
			private class Update extends AsyncTask<URL,String,String>{
				  
				@Override
				protected String doInBackground(URL... params) {
					
					  	String input = "";
					  	
					  	HttpURLConnection con;
					  	InputStream in;
					  	BufferedReader rd;
					  	StringBuilder buff = new StringBuilder();
					  	String a = null;
					  	
					  	
					  		   
					  	 try {
							con = (HttpURLConnection) params[0].openConnection();
							
							PackageInfo pInfo = null;
							try {
								pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
							} catch (NameNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							String curr_version = pInfo.versionName;
							
							try {
								in = con.getInputStream();
								
								rd = new BufferedReader(new InputStreamReader(in,"UTF-8"));
								
								int ch;
								String line;
								
								String server = rd.readLine();
//								a = server;
								
								if(!curr_version.equals(server)){
									a = "Update";
								}else{
									a = "No";
								}

							} catch (Exception e) {
								setContentView(R.layout.activity_main);
							}

						} catch (IOException e) {
							setContentView(R.layout.activity_main);
						}
					  	
				
//						return buff.toString();
					  	return a;
					  	   
					  	   
				}

				 protected void onPostExecute(String result) {
		 
					 if(result.equals("Update")){
						 
						 Uri uri = Uri.parse("http://sfk.flossk.org/android");
						 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
						 startActivity(intent);
						 
					 }
					 else if (result.equals("No")){
						 Toast.makeText(Sponsor.this, "Your app is up to date!", Toast.LENGTH_LONG).show();
						 
					 }

			     }
				   
			   }
			
			private Dialog createUpdateDialog() 
			   {
					final AlertDialog.Builder builder = new AlertDialog.Builder(this); 
					final View view = getLayoutInflater().inflate(R.layout.update_layout, null, false);// inflates the dev_about layout
					builder.setTitle("Update App"); // sets title to AlertDialog
					builder.setView(view); //// sets the view for builder
					builder.setPositiveButton(getString(android.R.string.ok), new android.content.DialogInterface.OnClickListener()
					{

						@Override
						public void onClick(DialogInterface dialog, int which) {
							try {
								new Update().execute(new URL("http://sfk.flossk.org/sites/default/files/android/a.php"));
							} catch (Exception e) {
								setContentView(R.layout.activity_main);
							}
							
						}
				
					}); // the possitive button strings is ok
					builder.setNegativeButton("Cancel",new android.content.DialogInterface.OnClickListener()
							{

								@Override
								public void onClick(DialogInterface dialog, int which) {
									if (which == Dialog.BUTTON_NEGATIVE)
								        dialog.dismiss();
									
								}
						
							});
					builder.setCancelable(true); // the dialog is cancelable after clicked ok
					return builder.create(); // creates the dialog
				}

}
