package com.novemio.android.ordertest.presentation.screens.order.add

import android.view.View
import android.view.View.GONE
import android.widget.Toast
import androidx.lifecycle.Observer
import com.novemio.android.core.BaseFragment
import com.novemio.android.ordertest.R
import kotlinx.android.synthetic.main.fragment_add_order.btnAddItem
import kotlinx.android.synthetic.main.fragment_add_order.etCustomUnit
import kotlinx.android.synthetic.main.fragment_add_order.etOrderName
import kotlinx.android.synthetic.main.fragment_add_order.rgUnits
import kotlinx.android.synthetic.main.toolbar_default_white.toolbarWhite

class OrderAddFragment : BaseFragment<OrderAddViewModel, OrderAddRoutes>() {
	
	override fun getLayoutId(): Int = R.layout.fragment_add_order
	
	override fun initView() {
		setToolbar(toolbarWhite, true)
		actionBar?.subtitle = "Fruit Planet"
		setRadioButtonListeners()
		btnAddItem.setOnClickListener {
			checkAndAddItem()
		}
	}
	
	private fun checkAndAddItem() {
		val unit = getUnits()
		when {
			etOrderName.text.isEmpty() -> Toast.makeText(activity!!, "Please add item name", Toast.LENGTH_SHORT).show()
			unit.isEmpty() -> Toast.makeText(activity!!, "Please add unit ", Toast.LENGTH_SHORT).show()
			else -> {
				viewModel.addOrder(etOrderName.text.toString(), unit)
			}
		}
		
	}
	
	private fun getUnits(): String =
		when (rgUnits.checkedRadioButtonId) {
			R.id.rbKg -> "Kg"
			R.id.rbGrams -> "Grams"
			R.id.rbCase -> "Case"
			else -> etCustomUnit.text.toString()
		}
	
	private fun setRadioButtonListeners() {
		
		rgUnits.setOnCheckedChangeListener { group, checkedId ->
			etCustomUnit.visibility = if (checkedId == R.id.rbCustom) View.VISIBLE else GONE
		}
	}
	
	override fun setObservers() {
		viewModel.itemAdded.observe(this, Observer {
			if(it){
				navigation.navController.popBackStack()
			}
		})
	}
	
}